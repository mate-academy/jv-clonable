# jv-cloneable

We have a Car class and an Engine class. Define the clone method so that the cloning will be deep.
Add at least 5 fields to each class (Car and Engine). Remember to use the engine in your car.
You also need to override `toString()` method for the car and engine.

Check the `clone ()` method in the `Application` class.

Steps:
1. create an engine;
2. create a car and assign an engine to it;
3. declare `carClone` variable by calling `clone()` on our existing car;
4. change one of the parameters (fields) of engine in the original car;
5. print the parameters of both cars to the console. Compare engines for both cars. 
If engine parameters differs in original and cloned car, the task is completed correctly, well done!
