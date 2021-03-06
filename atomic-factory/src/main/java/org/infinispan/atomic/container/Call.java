package org.infinispan.atomic.container;

import java.io.Serializable;

/*
* @author Pierre Sutra
* @since 7.2
*/
abstract class Call implements Serializable {
    long callID;
    public Call(long id){
        callID = id;
    }

    @Override
    public String toString(){
        return Long.toString(callID);
    }
}
