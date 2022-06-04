//
//  ContentView.swift
//  macosApp
//
//  Created by Dalton Stegner on 6/4/22.
//

import SwiftUI
import shared

struct ContentView: View {
    let greet = Greeting().greeting()
    
    var body: some View {
        Text(greet)
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
