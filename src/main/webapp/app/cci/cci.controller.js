(function () {
    'use strict';

    angular
        .module('investApp')
        .controller('CciController', CciController);

    CciController.$inject = ['$scope', 'CciService'];

    function CciController($scope, CciService, chartData) {
        var vm = this;

        $scope.controllerMessage = todayToString();

        vm.todayToString = todayToString;

        function todayToString() {
            var today = new Date();
            var dayName = today.toLocaleString('en-us', {weekday: 'long'});
            var monthName = today.toLocaleString('en-us', {month: 'long'});
            var date = today.getDate();

            return 'Today is ' + dayName + ', the ' + dateWithOrdinal(date) + ' of ' + monthName + ', ' + today.getFullYear();
        }

        function dateWithOrdinal(date) {
            return date + CciService.getOrdinalIndicator(date);
        }

        $scope.mainGridOptions ={
            dataSource: {
                type: "odata",
                transport: {
                    read: "https://demos.telerik.com/kendo-ui/service/Northwind.svc/Employees"
                },
                pageSize: 5,
                serverPaging: true,
                serverSorting: true
            },
            sortable: true,
            pageable: true,
            filterable: true,
            columns: [{
                field: "FirstName",
                title: "First Name",
                width: "120px"
            },{
                field: "LastName",
                title: "Last Name",
                width: "120px"
            },{
                field: "Country",
                width: "120px"
            },{
                field: "City",
                width: "120px"
            },{
                field: "Title"
            }]
        };

        $scope.chartConfig = {


            title: {
                text: 'Highcharts Polar Chart'
            },



            xAxis: {
                tickInterval: 45,
                min: 0,
                max: 360,
                labels: {
                    formatter: function () {
                        return this.value + '°';
                    }
                }
            },

            yAxis: {
                min: 0
            },

            plotOptions: {
                series: {
                    pointStart: 0,
                    pointInterval: 45
                },
                column: {
                    pointPadding: 0,
                    groupPadding: 0
                }
            },

            series: [{
                type: 'column',
                name: 'Column',
                data: [8, 7, 6, 5, 4, 3, 2, 1],
                pointPlacement: 'between'
            }, {
                type: 'line',
                name: 'Line',
                data: [1, 2, 3, 4, 5, 6, 7, 8]
            }, {
                type: 'area',
                name: 'Area',
                data: [1, 8, 2, 7, 3, 6, 4, 5]
            }]
        }
    }
})();
