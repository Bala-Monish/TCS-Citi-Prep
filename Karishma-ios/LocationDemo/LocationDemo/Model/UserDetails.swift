//
//  UserDetails.swift
//  LocationDemo
//
//  Created by Karishma Mayur on 1/16/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//
import UIKit
import CoreLocation

struct Geo : Decodable{
    
    var lat: String
    var lng: String
    //Calculate distance - computed property - can be optimized??
    var distance: String{
        get{
            let locationManager = CLLocationManager()
            var currentLoc: CLLocation!
            currentLoc = locationManager.location
            let userCoordinate  = CLLocation(latitude: (Double(lat) ?? 0), longitude: (Double(lng) ?? 0))
            let distanceInMeters = currentLoc.distance(from: userCoordinate)
            return String(format: "%.2f", distanceInMeters) + " meters"
            
        }
    }
}

struct Address : Decodable{
    
    var street: String
    var city: String
    var geo: Geo
    
}

struct UserDetails : Decodable{

    var name: String
    var email: String
    var address: Address
    
}

