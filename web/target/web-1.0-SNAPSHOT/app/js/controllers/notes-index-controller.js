angular.module('ParkSystem')
    .controller('NotesIndexController', ['$http','$scope', function($http,$scope) {
        var controller = this;

        $http({method: 'GET', url: '/notes'}).success(function(data) {
            $scope.notes = data;
        });
    }]);

