# Stopwatch tasks by Non Puthikanon (5910545710)
Task  |  Time
--------------------------------------------|-------:
Append  50,000 chars to String  |  0.795346 sec
Append 100,000 chars to String  |  2.688887 sec
Append 100,000 chars to StringBuilder  |  0.001941 sec
Add 1 billion double using array  |  1.208242 sec
Add 1 billion Double using array  |  5.205204 sec
Add 1 billion BigDecimal using array  |  9.093628 sec

## Explanation of Results
###Appending chars to String
when you add char to String, system will have two old values and creat the new one that are the String that has already sum.So the system are gonna take more time to run.
###Appending chars to StringBuilder
StringBuilder has a char array inside so when you add another char value ,StringBuilder will update  it in the array.
###Adding double
double is a primitive, sometime it rounds decimal places.So it take less time than using Double class and BigDecimal.
###Adding Double
Double is an object and when it want to calculate something it has to change to primitive and wrap back to object again, makes them use more time than double.
###Adding BigDecimal
When you use BigDecimal, it's known by their accurate. They will keep every decimal and that's take more memory and more time.
  


