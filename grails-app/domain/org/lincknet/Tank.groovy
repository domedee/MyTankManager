package org.lincknet

class Tank {
    
    String name;
    Integer size;
    static hasMany = [besatz:Besatz, measureSet:MeasureSet]

    static constraints = {
    }
    
   
}
