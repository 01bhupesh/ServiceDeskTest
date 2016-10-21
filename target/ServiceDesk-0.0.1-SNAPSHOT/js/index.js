var sdWeb = angular.module('sdWeb', ['ui.router','ngTable', 'ui.bootstrap']);

sdWeb.config( function($stateProvider, $urlRouterProvider) {
$urlRouterProvider.otherwise('/dashboard');
$stateProvider.state('dashboard', {
    url: '/dashboard',
    templateUrl: 'view/dashboard.html',
    controller: 'dashboardCtrl'
})
   .state('serviceRequest',{
	url: '/serviceRequest',
	templateUrl: 'view/serviceRequest.html',
	controller: 'myCtrl'
		
}).state('developmentRequest', {
	  url : '/developmentRequest',
	  templateUrl : 'view/developmentRequest.html',
	   controller :'developmentRequest'
		   
}).state('login', {
    url: '/login',
    templateUrl: 'index.html'
})
    .state('net_view', {
        url: '/net_view',
        templateUrl: 'resources/views/net_view.html'
})
    .state('mail_traffic', {
        url: '/mail_traffic',
        templateUrl: 'resources/views/mail_traffic.html'
})
    .state('c_panel', {
        url: '/c_panel',
        templateUrl: 'resources/views/control_panel.html',
        controller: "c_panel"
})
    .state('events', {
        url: '/events',
        templateUrl: 'resources/views/events.html'

});


});


sdWeb.controller('sdWebCtrl', function ($scope,$http){
	
	console.log("sdWebCtrl controole is called");
});