angular.module('ParkSystem')
    .controller('NotesCreateController', [function() {
        this.saveNote = function(note){
            $http({method: 'POST', url: '/notes', data: note});
        };
    }]);
