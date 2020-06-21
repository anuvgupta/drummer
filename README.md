# drummer  
Android app for creating drumbeats.  
Built with Android Studio for API 21 (Android KitKat).  
Created for Android App Making class at ID Tech Stanford summer camps in June 2014.  
Watch this [demo](https://www.youtube.com/watch?v=3RtFNokTpac).  

# features  
 - 9 drumset instruments, each corresponds to a row of checkboxes
 - Each column of checkboxes corresponds to the time at which a note is played
 - One can create new pages (new sets of columns) with the + button, which allows for longer projects
 - One can duplicate the current page with the * button
 - Each page has 16 columns, so 4/4 pieces are easiest to create
 - Hitting the play button sends a playhead from the beginning of the current page through the entire project
    - When the playhead reaches the end of the project (the last column of the last page), it loops to the first column of the first page and begins again seamlessly
    - On the first playthrough (before the first looping) there will be some stutter when the playhead moves between pages: it will skip time a little bit. This will stop happening after the first playthrough
 - One can change the speed/tempo of the playthrough: decreasing the slider on the lower right increases tempo, and vice versa

# missing features  
Features that I planned to build into the app, but never implemented due to time constraints during the course:  
 - The ability to delete pages
 - The ability to move pages
 - The ability to save your project to local storage
    - There is a save screen but it doesn't work
 - The ability to open saved projects


&nbsp;  
*2014*
