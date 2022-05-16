const filtrarMobile = document.querySelector('.menu-mobile');
const fecharMenu = document.querySelector('.fechar-menu');
const Abrirmenu = document.querySelector('.aside-menu')
Abrirmenu.addEventListener('click', function () {
  filtrarMobile.style.visibility = 'visible';
  filtrarMobile.style.width = '90%';


});
fecharMenu.addEventListener('click', function () {
  filtrarMobile.style.visibility = 'hidden';
  filtrarMobile.style.width = '0';


});