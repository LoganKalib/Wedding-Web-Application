
// Get the popups
var searchPopup = document.getElementById('searchPopup');
var searchResultPopup = document.getElementById('searchResultPopup');

// Get the close buttons
var closeButtons = document.getElementsByClassName('close');
for (var i = 0; i < closeButtons.length; i++) {
    closeButtons[i].addEventListener('click', function() {
        this.parentElement.parentElement.style.display = 'none'; // Close the parent popup
    });
}

// Function to open search popup
function openSearchPopup() {
    searchPopup.style.display = 'block';
}

// Function to simulate search (front-end only)
function searchEvent() {
    var eventId = document.getElementById('eventId').value.trim();
    if (eventId === '') {
        alert('Please enter an Event ID.');
        return;
    }

    // Simulate backend search (replace with actual backend logic)
    var eventFound = true; // Replace with actual backend response

    if (eventFound) {
        // Show search result popup
        searchResultPopup.style.display = 'block';
        // Display event details (replace with actual data)
        document.getElementById('searchResult').innerText = 'Event ID: ' + eventId + ' found.';
    } else {
        // Show not found message (optional)
        alert('Event ID: ' + eventId + ' not found.');
    }
}

// Function to simulate RSVP button click
function rsvp() {
    // Implement RSVP functionality here
    alert('RSVP functionality goes here.');
    // Close search result popup (if needed)
    searchResultPopup.style.display = 'none';
}

// Function to go back to search popup
function backToSearch() {
    // Close search result popup
    searchResultPopup.style.display = 'none';
    // Open search popup
    searchPopup.style.display = 'block';
}
