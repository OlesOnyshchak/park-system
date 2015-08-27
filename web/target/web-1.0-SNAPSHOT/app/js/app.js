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
        .when('/home', {
            templateUrl: 'app/templates/pages/welcome/home.html',
            controller: 'WelcomeController'
        })
        .when('/about', {
            templateUrl: 'app/templates/pages/welcome/about.html'
        })
        .when('/registration', {
            templateUrl: 'app/templates/pages/welcome/registration.html',
            controller: 'WelcomeController'
        })
        .when('/login', {
            templateUrl: 'app/templates/pages/welcome/login.html'
        })
        .when('/',{
            redirectTo: '/home'
        })
        .otherwise({ redirectTo: '/home'});
});
