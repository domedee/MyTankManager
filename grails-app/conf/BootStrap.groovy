import org.lincknet.MeasureSet
import org.lincknet.Tank

class BootStrap {

    def init = { servletContext ->
        if (!MeasureSet.count()){
            new MeasureSet(ph: 7.2 , kh:21,  gh:15, temperatur: 21, no2:0, no3:10, dateOfMeasuring: "14.11.2011")
            new MeasureSet(ph: 7.2 , kh:21,  gh:15, temperatur: 21, no2:0, no3:10, dateOfMeasuring: "15.11.2011")
            def tank = new Tank(name: "Wohnzimmer, 180l", size: 180)
            tank.addToMeasmeasureSet(new MeasureSet(ph: 7.2 , kh:21,  gh:15, temperatur: 21, no2:0, no3:10, dateOfMeasuring: "14.11.2011"))
            tank.addToMeasmeasureSet(new MeasureSet(ph: 7.2 , kh:21,  gh:15, temperatur: 21, no2:0, no3:10, dateOfMeasuring: "15.11.2011"))
            tank.save();
        }
    }
    def destroy = {
        if (!MeasureSet.count()){
            ArrayList liste = MeasureSet.findAll()
            //for
        }
    }
}
