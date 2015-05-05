package gui;

import java.util.EventObject;


public class CryptographicInfo extends EventObject{

    /// Attributes ///
    private String inputLocation , outputLocation, key;
    private Order eventOrder;


    /// Constructor ///
    public CryptographicInfo(Object source) {
        super(source);
        this.inputLocation = null;
        this.outputLocation = null;
        this.key = null;
    }

    public CryptographicInfo(Object source, String inputLocation, String outputLocation,
                             String key, Order eventOrder) {
        super(source);
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
        this.key = key;
        this.eventOrder = eventOrder;
    }

    /// Methods ///
    public String getInputLocation() {
        return inputLocation;
    }
    public void setInputLocation(String inputLocation) {
        this.inputLocation = inputLocation;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getOutputLocation() {
        return outputLocation;
    }
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }
    public Order getEventOrder() {
        return eventOrder;
    }
    public void setEventOrder(Order eventOrder) {
        this.eventOrder = eventOrder;
    }
}
