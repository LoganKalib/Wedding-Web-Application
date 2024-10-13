const wrapper = document.querySelector('.wrapper');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register-link');
const btnPopup = document.querySelector('.btnLogin-popup');
const iconClose = document.querySelector('.icon-close');

// let lockIcon = document.getElementById("lock-closed");
// let password = document.getElementById("password");

registerLink.addEventListener('click', ()=> {
    wrapper.classList.add('active');
})

loginLink.addEventListener('click', ()=> {
    wrapper.classList.remove('active');
})

btnPopup.addEventListener('click', ()=> {
    wrapper.classList.add('active-popup');
})

iconClose.addEventListener('click', ()=> {
    wrapper.classList.remove('active-popup');
})

document.getElementById('loginForm').addEventListener('submit', () => {
    //localStorage.removeItem('email')
    //localStorage.removeItem('customerId')

    var email = document.getElementById('email2').value;
    localStorage.setItem('email', email);
    // localStorage.removeItem('customerId')

    // fetch('http://localhost:8080/weddings/rsvp/' + email)
    //     .then(response => {
    //         return response.json();
    //     })
    //     .then(data => {
    //         localStorage.setItem('customerId', data.custId)
    //     })
    //     .catch(error => console.error('Error:', error));
})