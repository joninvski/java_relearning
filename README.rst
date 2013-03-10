Global
======

* If I am a service and I'm building objects with a factory, then i need to inject the factory

* If I am a service and I depend of other services, then I need to be injected with the other services
 
* If I am only a object, I DO NOT have a injector 
  ** Unless I need a service, in which case, my factory gives it to me. In the factory the services were injected at the object constructor (that then are passed to me, the object).

* In summary only services (or factories) are injected (REALLY IMPORTANT)

In main
=======

* If I have some global DB connection (service) I just create the instance and then bind the DB connector interface to that instance. whoever uses the DB connection now has a connectionto it (think if it has to be singleton as guice has an option for that)

* Factories are binded by interface to class
