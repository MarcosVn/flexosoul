angular.module('FlexoSoulApp', ['ui.bootstrap']);
angular.module('FlexoSoulApp').controller('FlexoSoulCtrl', function($scope){
	$scope.navLink = [
		{name: 'Home', reference: '#'},
		{name: 'História', reference: '#'},
		{name: 'Galeria', reference: '#'},
		{name: 'Contato', reference: '#'},
	];

	$scope.interval = 5000;
	
	var t1 = 'Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.'
	
	$scope.slides = [
		{image: 'http://lorempixel.com/1600/500/sports/1', title: 'First Thumbnail label', text: t1},
		{image: 'http://lorempixel.com/1600/500/sports/2', title: 'Second Thumbnail label', text: t1},
		{image: 'http://lorempixel.com/1600/500/sports/3', title: 'Third Thumbnail label', text: t1},
	];
});