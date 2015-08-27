angular.module('ParkSystem')
    .controller('UserController', ['$scope', '$http', function($scope, $http) {
        $scope.user = [true, true, true];

        $scope.setActiveTab = function(order){

            for(i=0;i<$scope.admin.length;i++){
                if($scope.admin[i]!=$scope.admin[order]){
                    console.log(i);
                    $scope.admin[i] = true;
                }
            }
            $scope.user[order] = false;
        };
    }]);