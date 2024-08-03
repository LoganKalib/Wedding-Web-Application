function loadContent(section) {
    const sections = document.getElementsByClassName('content-section');
    for (let i = 0; i < sections.length; i++) {
        sections[i].style.display = 'none';
    }
    document.getElementById(section + '-content').style.display = 'block';
}

// Hard coded couple values. Displays the details for RSVP
function showEventDetails(couple) {
    let modalId = couple === 'Barry & Vanessa' ? 'eventModalBarryVanessa' : '';
    if (modalId) {
        let modal = document.getElementById(modalId);
        modal.style.display = "block";
    }
}

// Close the modal when the user clicks on <span> (x)
window.onload = function() {
    const modals = document.getElementsByClassName('modal');
    for (let i = 0; i < modals.length; i++) {
        const modal = modals[i];
        const closeButton = modal.querySelector('.close');

        if (closeButton) {
            closeButton.onclick = function() {
                modal.style.display = "none";
            }
        }
    }
}

// Close the modal when the user clicks anywhere outside the modal
window.onclick = function(event) {
    const modals = document.getElementsByClassName('modal');
    for (let i = 0; i < modals.length; i++) {
        const modal = modals[i];
        if (event.target === modal) {
            modal.style.display = "none";
        }
    }
}
