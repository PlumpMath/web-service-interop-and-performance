### gSOAP implementation

The gSOAP development files are required to compile the gSOAP service implementation.

On Debian/Ubuntu systems: `apt-get install gsoap`

Compile with:
`g++ -std=c++0x -o server server.cpp soapC.cpp soapServer.cpp -lgsoap++ -lpthread`  
(`std=c++0x` can be omitted when using a C++11 compiler.)
