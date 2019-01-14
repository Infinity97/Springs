### Aspect Oriented programming

_Concern_ -- logic

_aspect_ -- Additional business logic over the already available logic

_join point_  -- Overiding the logic available 

_point cut_ -- father not allowing keys due to below 18

####For the two Add Fnction 

_Concern_ -- Add Method invocation

_Aspect_ -- Additional; Logic for @log

_Join point_ --  Method Signature of the two Add Methods is understood here.

_point Cut_ -- Definition of a Join point is a Join point.

Asects should not have too much of logic and multiple methods can have different asects. 

Typically stat the database connection in the business logic layer to check for any inconsisitencies

Using interfaces we have injected arguments from the caller to the callee

Thus using the logic of  _Injection_ we don't need to explicitly ask for or create another object 

Autowire is useful for injecting the dependency

If we exlicitly create an object 