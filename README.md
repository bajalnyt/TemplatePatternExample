<u>What is the Template Pattern</u>

Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.


<u>When Would I Use This Pattern?</u>

The Template Method pattern is used when 
<ul>
<li>When behaviour of an algorithm can vary, you let subclasses implement the behaviour through overriding
<li>You want to avoid code duplication, implementing variations of the algorithm in subclasses
<li>You want to control the point that subclassing is allowed.`