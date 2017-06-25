/**
	 * 1st Machine Learning Concept - Training Data
	 * @author Hyalen Neves Caldeira
	 * @see java.MyIO
	 * @see java.Arq
	 * @version 1.0
	 * @since SDK 1.8.0
**/ 

/**
 * Based on the book 'Make Your Own Neural Network',
 * we have two types of birds, and their physical specifications:
 * Caterpillar --> width = 1 // length = 3
 * Ladybird    --> width = 3 // length = 1
 */
class TypesOfBug {
  private int length; //or 'y' in the book
  private int width; //or 'x' in the book
  private int parameter; //or 'A' in the book
  /**
   * First constructor that initializes our variables
   */
  public TypesOfBug() {
    length = width = parameter = 0;
  }

  /**
   * Second constructor that sets each
   * @param  int length        Caterpillar/Ladybird length
   * @param  int width         Caterpillar/Ladybird width
   * @param  int parameter     The parameter that we will use
   */
  public TypesOfBug(int length, int width, int parameter) {
    this.length = length;
    this.width = width;
    this.parameter = parameter;
  }

  /**
   * Setters and Getters
   */
  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return this.length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWidth() {
    return this.width;
  }




}

public class LearningRate {
  public static void main(String [] args) {

  }
}
