package adapter;

import adapter.extra.GeometricShape;
import adapter.extra.Rhombus;
import adapter.extra.Triangle;

/**
 * 
 * We need to have here is an adapter, which makes this ready-to-use 
 * code compatible with our code and the  Drawing in this example.
 *
 * Now, when we are clear on why we need the adapter, 
 * let's take a closer look at what the adapter actually does. 
 * Before we start, below is the list of classes/objects used 
 * in the adapter pattern:
 * 
 * Target — This defines the domain-specific interface 
 * that the client uses. This is the Shape interface in our example.
 * 
 * Adapter — This adapts the interface from the adaptee to the 
 * target interface. I will point the adapter classes based on 
 * the different approach below.
 * 
 * Adaptee — This defines an existing interface that needs adapting. 
 * This is the GeometricShape interface in our example.
 * 
 * Client — This collaborates with objects conforming to the Target 
 * interface. The Drawing class is the client in our example.
 * 
 * 
 * The Adapter extends the Target and implements the Adaptee
 * 
 * 
 */



public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
          super();
          this.adaptee = adaptee;
    }

    @Override
    public void draw() {
    	adaptee.drawShape();
    }

    @Override
    public void resize() {
    	System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
          if (adaptee instanceof Triangle) {
        	  return "Triangle object";
          } else if (adaptee instanceof Rhombus) {
        	  return "Rhombus object";
          } else {
        	  return "Unknown object";
          }
    }

    @Override
    public boolean isHide() {
    return false;
    }

}
