angular.module('ParkSystem',['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/user',{
            templateUrl:'app/templates/pages/user/index.html',
            controller: 'UserController'
        })
        .when('/admin', {
            templateUrl: 'app/templates/pages/admin/index.html',
            controller: 'AdminController'
        })
        .when('/welcome', {
            templateUrl: 'app/templates/pages/welcome/index.html',
            controller: 'WelcomeController'
        })
        .when('/welcome/about', {
            templateUrl: 'app/templates/pages/welcome/about.html'
        })
        .when('/welcome/registration', {
            templateUrl: 'app/templates/pages/welcome/registration.html',
            controller: 'WelcomeController'
        })
        .when('/welcome/login', {
            templateUrl: 'app/templates/pages/welcome/login.html'
        })
        .when('/',{
            redirectTo: '/welcome'
        })
        .otherwise({ redirectTo: '/welcome'});
});
