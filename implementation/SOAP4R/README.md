### SOAP4r client implementation

The official soap4r project is not active anymore.  
For our implementation we used a fork that provides support for Ruby 1.9:  
[https://github.com/mumboe/soap4r](https://github.com/mumboe/soap4r)

soap4r provides a script called wsdl2ruby which generates the client implementation.  
The file UserServcieClient.rb contains our client tests.

To run the implementation it is required to have soap4r (for Ruby 1.9) installed.