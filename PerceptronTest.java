import java.util.*;
/**
	* 1st Neural Network Concept - Multiple Layers w/ Sigmoid Function
	* @author Hyalen Neves Caldeira
	* @version 2.0
	* @since SDK 1.8.0
**/

/**
 * --This little introduction is just a trustful reminder for those (including myself) that are
 * not 100% familiar with neural networks. Based on the book "How To Make Your Own Neural Network"--
 *
 * 1) What is a perceptron?
 * A perceptron is the most basic form of an artificial neural network: a linear classifier
 *
 * 2) What will be tested in this code?
 * The following concepts and core ideas taken from the book will be tested:
 * - weights
 * - input layer
 * - output layer
 * - activation function (Sigmoid)
 */
class Perceptron {
  //first matrix of nodes (input layer)
  double [][] node;

  //first matrix of weights (input weight)
  double [][] weight;

  //matrix that stores the multiplication between node and weight
  double [][] nodeWeight;

  double [][] hiddenLayer1;

  //dimensions from our matrices
  int line1, column1, line2, column2;

  /**
   * Constructor
   */
  public Perceptron(double threshold, int line1, int column1, int line2, int column2) {
    node = new double[line1][column1];
    weight = new double[line2][column2];
    nodeWeight = new double[line1][column2];
    hiddenLayer1 = new double[line1][column2];

    this.threshold = threshold;
    this.line1 = line1;
    this.column1 = column1;
    this.line2 = line2;
    this.column2 = column2;
  }

  public void read() {
    Scanner scanner = new Scanner(System.in);

    //Filling the input matrix with values between 0 and 1
    for (int i = 0; i < line1; i++) {
      for (int j = 0; j < column1; j++) {
        System.out.print("Enter the input from position [" + i + ", " + j + "]" + ": ");
        node[i][j] = scanner.nextDouble();
      }
    }

    System.out.println("");

    //Filling the weight matrix with values between 0 and 1
    for (int i = 0; i < line2; i++) {
      for (int j = 0; j < column2; j++) {
        System.out.print("Enter the weight from position [" + i + ", " + j + "]" + ": ");
        weight[i][j] = scanner.nextDouble();
      }
    }
  }//end read()

  /**
   * [Description]: now that we filled both matrices with their values,
   * we need to update the values, doing the following:
   * node[] * weight[][]
   * Note: column from the first matrix must be equal to this.line from the second one
   */
  public void multiply() {
    double sum = 0;

    for (int i = 0; i < this.line1; i++) {
      for (int j = 0; j < this.column2; j++) {
        for (int k = 0; k < this.line2; k++) {
          sum = sum + node[i][k] * weight [k][j];
        }

        nodeWeight[i][j] = sum;
        sum = 0;

      }
    }
  }//end multiply()

  public void applySigmoid() {
    for (int i = 0; i < this.line1; i++) {
      for (int j = 0; j < this.column2; j++) {
        hiddenLayer1[i][j] = sigmoid(nodeWeight[i][j]);
      }
    }
  }

  /**
   * @param double x - value of the current position from the X-matrix
   * @return the new value applied to the sigmoid function
   */
  public double sigmoid(double x) {
    return (1/( 1 + Math.pow(Math.E,(-1*x))));
  }

  public void print() {
    for (int i = 0; i < this.line1; i++) {
      for (int j = 0; j < this.column2; j++) {
        System.out.print(hiddenLayer1[i][j] + " ");
      }

      System.out.println("");
    }
  }
}//end Perceptron

public class PerceptronTest {
  public static void main(String [] args) {
    //the threshold in this code is an arbitrary double between 0 and 1
    //you can put the double value you'd like
    Perceptron node = new Perceptron(0.78, 3, 1, 1, 3);

    node.read();
    node.multiply();
    node.applySigmoid();
    node.print();
  }
}
