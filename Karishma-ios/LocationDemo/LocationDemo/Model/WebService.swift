//
//  WebService.swift
//  LocationDemo
//
//  Created by Karishma Mayur on 1/23/20.
//  Copyright © 2020 Karishma Mayur. All rights reserved.
//

import Foundation

class WebService{
    
    func fetchData(completionHandler: @escaping ([UserDetails]) -> Void) {
      let url = URL(string: "https://jsonplaceholder.typicode.com/users")!

      URLSession.shared.dataTask(with: url, completionHandler: { (data, response, error) in
        if let error = error {
          print("Error with fetching users: \(error)")
          return
        }
        
        guard let httpResponse = response as? HTTPURLResponse,
              (200...299).contains(httpResponse.statusCode) else {
                print("Error with the response, unexpected status code: \(String(describing: response))")
          return
        }

        if let data = data,
          let users = try? JSONDecoder().decode([UserDetails].self, from: data) {
            completionHandler(users)
        }
      }).resume()
    }    
}
