package org.lincknet

class MeasureSet {
    
    static belongsTo = [tank:Tank]
    
    Float ph
    Integer kh
    Integer gh
    Integer temperatur
    Integer no2
    Integer no3
    Date dateOfMeasuring

    static constraints = {
    }
}
