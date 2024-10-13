
// Get the popups
var searchPopup = document.getElementById('searchPopup');
var searchResultPopup = document.getElementById('searchResultPopup');
var event;

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
    eventId = document.getElementById('eventId').value.trim();
    if (eventId === '') {
        alert('Please enter an Event ID.');
        return;
    }

    fetch('http://localhost:8080/weddings/' + eventId)
        .then(response => {
            if (response.ok) {
                return response.json(); // Parse the response as JSON
            } else {
                throw new Error('Event not found');
            }
        })
        .then(data => {
            // var searchResultPopup = document.getElementById('searchResultPopup');
            searchResultPopup.style.display = 'block';

            document.getElementById('searchResult').innerText = `
                Event ID: ${data.eventId}
                Bride: ${data.brideName} ${data.brideSurname}
                Groom: ${data.groomName} ${data.groomSurname}
                Venue: ${data.venueName}, ${data.venueAddress}
                Date: ${data.date}
                Start Time: ${data.startTime}
                No of Tables: ${data.noOfTables}
            `;
            event = data.eventId;
        })
        .catch(error => {
            alert('Event ID: ' + eventId + ' not found.');
        });

    // // Simulate backend search (replace with actual backend logic)
    // var eventFound = true; // Replace with actual backend response
    //
    // if (eventFound) {
    //     // Show search result popup
    //     searchResultPopup.style.display = 'block';
    //     // Display event details (replace with actual data)
    //     document.getElementById('searchResult').innerText = 'Event ID: ' + eventId + ' found.';
    // } else {
    //     // Show not found message (optional)
    //     alert('Event ID: ' + eventId + ' not found.');
    // }
}

// Function to simulate RSVP button click
function rsvp() {

    //const email = localStorage.getItem('email');

    fetch('http://localhost:8080/weddings/rsvp', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            custId: { custId: localStorage.getItem('customerId')},
            eventId: { eventId: event }
        })
    })
        .then(response => response.json())
        .then(data => {
            alert('RSVP Created');
        })
        .catch(error => {
            alert("Unable to RSVP");
        });
    // Implement RSVP functionality here
    //alert('RSVP functionality goes here.');
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
