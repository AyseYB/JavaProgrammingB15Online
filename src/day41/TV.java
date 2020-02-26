package day41;

/**
 * TV
 *    attributes :
 * 	brand , isOn , currentChannel
 * 	Stirng , boolean , int   (range from 1-50)
 *    behaviours :
 *    	turnOn
 *    	turnOff
 *    	getcurrentChannel
 *    	setcurrentChannel (newChannelNumber)
 *    	moveForward
 * 	moveBackward
 */
public class TV {

    String name  ;
    boolean isOn ;
    int currentChannel ;

    /**
     * A method to return the value of current channel for the TV
     * @return the value of current channel for the tv
     */
    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel){
        if(newChannel < 0 || newChannel >50){
            System.out.println("Invalid Channel, getting out");
            return;
        }
        if(isOn == true){
            currentChannel= newChannel;
        }else {
            System.out.println("Turn on the tv first");
        }

    }

    public void turnOn(){
        System.out.println("Turning on TV");
        if(isOn == false){  //checking for equality
            isOn = true;    // assigning the value if isOn to true
        }
    }

    public void turnOff(){
        if(isOn == true){
            System.out.println("Turning off TV");
            isOn = false;
        }

    }


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}

