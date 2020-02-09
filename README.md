



# Interface :
an interface is not a class but a set of *requirements* for the **classes** that want to comform to the interface. it is only has static constants and **abstract** method. 
The **interface** keyword is used to declare an interface.
The *syntax* of interface is

interface <interface_name>
{

}
## Notes of interface:
Interface methods do not have a body - the body is provided by the "implement" class.
Interface methods are by default *abstract* and *public*.
Interface attributes are by default *public*, *static* and *final*.
An interface cannot contain a *constructor* (as it cannot be used to create objects)
