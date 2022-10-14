/*
* A module is a named set of packages
* The packages in this module are simply the ones that live here together
* You don't have to list them explicity
* com.entertainment
* com.entertainment.util
*
*/




module com.entertainment {
    //which *packages* does this module expose? (via 'exports' directive)
    //we want to hide USEFUL from com.entertainment
    exports com.entertainment;
    }