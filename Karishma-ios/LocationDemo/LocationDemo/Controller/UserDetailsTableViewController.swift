//
//  UserDetailsTableViewController.swift
//  LocationDemo
//
//  Created by Karishma Mayur on 1/16/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//

import UIKit
import CoreLocation

class UserDetailsTableViewController: UITableViewController {
    
    var users = [UserDetails]()
    

    override func viewDidLoad() {
        super.viewDidLoad()
            
        WebService().fetchData { [weak self] (users) in
             self?.users = users
             DispatchQueue.main.async {
               self?.tableView.reloadData()
             }
           }
    }

    // MARK: - Table view data source

    override func numberOfSections(in tableView: UITableView) -> Int {
        // #warning Incomplete implementation, return the number of sections
        return 1
    }

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // #warning Incomplete implementation, return the number of rows
        return users.count
    }

    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        
        let cellIdentifier="userDetailsCell"
        
        guard let cell = tableView.dequeueReusableCell(withIdentifier: cellIdentifier, for: indexPath) as? UserDetailsTableViewCell  else {
            fatalError("The dequeued cell is not an instance of UserTableViewCell.")
        }

        // Configure the cell...
                 
        let user = users[indexPath.row]
        
        cell.NameLabel.text = user.name
        cell.EmailLabel.text = user.email
        cell.AddressLabel.text = user.address.city + " " + user.address.street
        cell.DistanceLabel.text = user.address.geo.distance

        return cell
    }
    

    /*
    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }
    */

    /*
    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCell.EditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
    */

    /*
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {

    }
    */

    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }
    */

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */
    
    /*
    func loadSampleData()
    {
        
        
     guard let user1 = UserDetails(name : "Karishma", email: "k@gmail.com", address: "314 SW Blvd", distance: "2.3km" ) else {
                  fatalError("Unable to instantiate user1")
              }
              
              guard let user2 = UserDetails(name : "Bala", email: "b@gmail.com", address: "313 SW Blvd", distance: "1.3km" ) else {
                               fatalError("Unable to instantiate user2")
                           }
              
              guard let user3 = UserDetails(name : "Arun", email: "a@gmail.com", address: "312 SW Blvd", distance: "3.3km" ) else {
                               fatalError("Unable to instantiate user3")
                           }
              
              users += [user1, user2, user3]
        
    }
    */
}
