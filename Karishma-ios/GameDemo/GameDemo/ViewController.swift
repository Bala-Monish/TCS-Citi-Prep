//
//  ViewController.swift
//  GameDemo
//
//  Created by Karishma Mayur on 1/29/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    var currentValue = 0
    var targetValue = 0
    var score = 0
    var round = 0
    
    @IBOutlet weak var slider: UISlider!
    @IBOutlet weak var targetLabel: UILabel!
    @IBOutlet weak var scoreLabel: UILabel!
    @IBOutlet weak var roundLabel: UILabel!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
       startNewRound()
        
    }
    
    @IBAction func ShowAlert(_ sender: Any) {
        
        let differene = abs(targetValue - currentValue)
        var points = 100 - differene
       
        
        let title:String
        if differene == 0{
            title = "Awesome: Perfect Score"
            points += 100
        } else if differene < 5{
            title = "Almost there"
            if differene == 1{
                points += 50
            }
        } else if differene < 10{
            title = "Good Job"
        } else{
            title = "Not even close"
        }
        
        score += points
    
        
        let message = "You scored \(points) points"
        
        let alert = UIAlertController.init(title: title, message:message , preferredStyle: UIAlertController.Style.alert)
        
        let ok = UIAlertAction.init(title: "OK", style: UIAlertAction.Style.default, handler: {
            action in
            self.startNewRound()
        })
        
        alert.addAction(ok)
        
        present(alert, animated: true, completion: nil)
        
    }
    
    @IBAction func moveSlider(_ sender: UISlider) {
        currentValue = Int(sender.value.rounded())
    }
    
    @IBAction func restartGame(_ sender: UIButton) {
        round = 0
        score = 0
        startNewRound()
    }
    
    func startNewRound()
    {
        round += 1
        slider.value = 50.0
        currentValue = Int(slider.value)
        targetValue = Int.random(in: 1...100)
        targetLabel.text = String(targetValue)
        scoreLabel.text = String(score)
        roundLabel.text = String(round)
        
    }
    
    
    

}

