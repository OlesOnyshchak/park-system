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
        .when('/',{
            redirectTo: '/welcome'
        })
        .otherwise({ redirectTo: '/welcome'});
});
