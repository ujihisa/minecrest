# Minecrest

You can implement useful REST end points easily to your Minecraft CraftBukkit server.

# License

GPL v3

# Authors

* Tatsuhiro Ujihisa
* supermomonga

# Installation


# Configuration and run HTTP server

CraftBukkit doesn't start the server automatically, so you need to run by following command.

    $ sbt run
    $ curl -I http://127.0.0.1:12380
    HTTP/1.1 200 OK

# Usage

Simply, request your server by GET or POST method. You can choose request filetype with request url.

    // Online member with JSON format
    curl http://yourbukkithost:12380/api/v1/users/online.json
    // Online member with XML format
    curl http://yourbukkithost:12380/api/v1/users/online.xml

# パニャー
nya-n
