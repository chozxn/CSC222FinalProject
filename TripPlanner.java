

public class TripPlanner {

    private final String ORGIN = "MSP";
    private String destination;             //JFK, LHR, or CDG
    private String tripType;                //One-way or Round trip
    private String departTime;              //8:00am, 12:30pm, 5:00pm, 10:45pm
    private String returningTime;           //6:00am, 10:30am, 3:00pm, 8:45pm
    private int numberOfpassengers;
    private String cabinClass;              //3.Main, 2.Comfort, 1.First Class
    private double price;
    
    
    
}

/* 

if JFK, price = 
if LHR, price = 
if CDG, price = 

if departTime = 8:00am, price = price
if departTime = 12:30pm, price = price + 100
if departTime = 5:00pm, price = price + 50
if departTime = 10:45pm, price = price - 50
