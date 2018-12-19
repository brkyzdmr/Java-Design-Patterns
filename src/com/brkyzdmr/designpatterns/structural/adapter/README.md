# Adapter

#### When to use
* To wrap an existing class with a new interface
* To perform impedance matching

#### Intent
* Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

#### Components
1. Target: Defines the domain-specific interface that Client uses.
2. Adapter: Adapts the interface Adapteee to the Target interface.
3. Adaptee: Defines an existing interface that needs adapting.
4. Client: Collaborates with objects conforming to the Target interface.

#### Implementation
* Assume that you have an e-commerce application which is serving your customers for a long time. This e-commerce application is using a Legacy Order Management System(OMS). Due to the high maintence cost and degraded performance of the legacy OMS software, you have decided to use a cheap and efficient OMS software which is readibly available in the market. However, you realize that the interfaces are different in the new software and it requires a lot of code change in the existing e-commerce application.
* Adapter design pattern can be very useful in these situations. Instead of modifying your e-commerce application to use the new interfaces, you can write a 'wrapper' class that acts as a bridge between your e-commerce application and the new OMS software. With this approach, the e-commerce application can still use the old interface.
* Adapter design pattern can be implemented in two ways. One using the inheritance method(Class Adapter) and second using the composition(Object Adapter). The following example depicts the implementation of Object adapter.

#### UML Diagram


#### Benefits
* Class adapter can override adaptee's behavior.
* Objects adapter allows a single adapter to work with many adaptees.
* Helps achieve reusability and flexibility.
* Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.

#### Drawbacks
* Object adapter involves an extra level of indirection.

#### Real World Examples
* Power adapters
* Memory card adapters

#### Software Examples
* Wrappers used to adapt 3rd parties libraries and frameworks.

#### Java SDK Examples
* java.util.Arrays asList()
* java.util.Collections list()
* java.util.Collections enumeration()
* java.ioInputStreamReader(InputStream) (returns a Reader)
* java.io.OutputStreamWriter(OutputStream) (returns a Writer)
