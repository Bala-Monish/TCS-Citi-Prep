//
//  MealTableViewCell.swift
//  DemoProject
//
//  Created by Karishma Mayur on 1/8/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//

import UIKit

class MealTableViewCell: UITableViewCell {
    
    //Mark : Properties
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var photoImageView: UIImageView!
    @IBOutlet weak var ratingControl: RatingControl!
    
    

    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
