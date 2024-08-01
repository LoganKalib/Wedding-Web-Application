
function loadContent(section) {
    const sections = document.getElementsByClassName('content-section');
    for (let i = 0; i < sections.length; i++) {
        sections[i].style.display = 'none';
    }
    document.getElementById(section + '-content').style.display = 'block';
}

function showEventDetails(couple) {
    let modalId = couple === 'John & Sarah' ? 'eventModalJohnSarah' : 'eventModalBarryVanessa';
    let modal = document.getElementById(modalId);
    modal.style.display = "block";

    // Close the modal when the user clicks on <span> (x)
    modal.querySelector('.close').onclick = function() {
        modal.style.display = "none";
    }

    // Close the modal when the user clicks anywhere outside the modal
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}