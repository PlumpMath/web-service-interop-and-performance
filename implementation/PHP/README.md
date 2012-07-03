### PHP Server implementation

The PHP implementation requires a webserver running PHP with SOAP support enabled (see [the official PHP documentation](http://www.php.net/manual/en/soap.setup.php)). Furthermore a database server that is supported by the PHP PDO abstraction layer is required (for exampel MySQL). Fill in the database connection information at line 8 and 9 in server.php.

The request and response datatypes where generated using the [wsdl2phpgenerator](http://code.google.com/p/wsdl2phpgenerator/) script.