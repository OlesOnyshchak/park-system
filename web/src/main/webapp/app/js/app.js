angular.module('ParkSystem',['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/user',{
            templateUrl:'app/templates/pages/user/index.html'
        })
        .when('/admin', {
            templateUrl: 'app/templates/pages/admin/index.html'
        })
        .when('/welcome', {
            templateUrl: 'app/templates/pages/welcome/index.html'
        })
        .when('/',{
            redirectTo: '/welcome'
        })
        .otherwise({ redirectTo: '/welcome'});
});