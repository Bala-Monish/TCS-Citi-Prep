//
//  UserDetailsTableViewCell.swift
//  LocationDemo
//
//  Created by Karishma Mayur on 1/16/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//

import UIKit

class UserDetailsTableViewCell: UITableViewCell {
    @IBOutlet weak var NameLabel: UILabel!    
    @IBOutlet weak var EmailLabel: UILabel!
    @IBOutlet weak var AddressLabel: UILabel!
    @IBOutlet weak var DistanceLabel: UILabel!
    
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
