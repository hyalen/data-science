# data-science

This repository is for learning purposes only. Made by Hyalen Neves Caldeira and Carolina Serrano Lopes. 

# Preparing data...

In order to develop a concise neural network to learn from data, we must firstly set the right values. There are a few core concepts before choosing random values for the inputs, weights and thus analyse the outputs.

# - Inputs:
When we are talking about very large inputs, the activation function (Sigmoid, for instance) gets very flat. And when that happnes, the ability to learn becomes limited, because the gradient used in this portion of the network is insignificant. This is called "saturating a neural network", and must be avoided. 
   
   -- In this case, we should try to keep the inputs small. Note that "small" here is not 0.000000001, because too many zeros might lead         to a non accuracy from computers, and that must be avoided as well.
   
   -- A good recomendation is to rescale inputs into the range of 0.0 and 1.0, trying not to put 0.0, of course. If that happens, the           learning ability from the weight update is zeroed.
   
# - Outputs:
Outputs are basically the values that pops out from the last layer of nodes. There are a couple of important characteristics from the output values.

   -- Signals above 1.0 are not covered by the Sigmoid Function, actually it only gets very close to it, we call this as "asymptotically         approaching". If we set the target output signals into the following range: 0.0 > x or 1.0 < x, then our network will update the           weights in a larger scale, in an attempt to produce bigger and bigger outputs. To sum up, signals outside the range of the                 activation functions are bad, and must be avoided.
   
   -- A good way to solve this is to set the range between 0.0 and 1.0 (at this point of the text you know that actual 0 or actual 1 cant       be made, so just set the range between 0.01 and 0.99).

# Initial Weights:
The same arguments that covers the initial input and output values must be considered here as well. We should keep large signals away from our network, because it saturates it and reduces the ability to learn better weights. So, we could use a range between -1 and 1, right? It should solve the issue. Well, we can do better...

   -- 
