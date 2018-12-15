# Abstract Factory

#### When to use
* To support families of related or dependent objects.
* To encapsulate platform dependencies to make an application portable.
* To prevent client code from using the 'new' operator.
* To easily swap the underlying platform with minimal changes.

#### Intent
* Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

#### Components
1. An Abstract Factory class(public)
2. Factory implementations for various families(protected)
3. Interfaces for various products(public)
4. Set of product implementations for various families(protected)

#### Benefits
* Loosely coupled code.
* Abstract Factory provides a single point of access for all products in a family.
* New product family can be easily supported.

#### Drawbacks
* More layers of abstraction increases complexity.
* If there are any changes to any underlying detail of one factory, the interface might need to be modified for all the factories.

#### Real World Examples 
* Providing data access to two different data sources(e.g. a SQL DB and a XML file). You have two different data access classes(a gateway to the datastore). Both inherit from a base class that defines the common methods to be implemented(e.g. Load, Save, Delete). Which data source shall be used shouldn't change the way client code retrives it's data access class. Your Abstract Factory knows which data source shall be used and returns an appropriate instance on request. The factory returns this instance as the base class type.

#### Software Examples
* Dependency injection

#### Java SDK Examples
* javax.xml.parsers.DocumentBuilderFactory newInstance()
* javax.xml.transform.TransformerFactory newInstance()
* javax.xml.xpath.XPathFactory newInstance()
