import {data} from "../services/report-model";
import {DataLoader} from "../services/data-loader";
import {StatusConverter} from "../services/status-converter";
import {autoinject} from "aurelia-framework";
import {StatisticsGenerator} from "../services/statistics-generator";
import {ClassStatistics} from "../services/statistic-models";
import IMethodContext = data.IMethodContext;

@autoinject()
export class Classes {
  private _classStatistics:ClassStatistics[] = [];
  private _methodContext: IMethodContext[] =[];
  private _methods;
  constructor(
    private _dataLoader:DataLoader,
    private _statusConverter:StatusConverter,
    private _statisticsGenerator:StatisticsGenerator,

  ) {
  }
  attached() {
    this._statisticsGenerator.getExecutionStatistics().then(executionStatistics => {
      executionStatistics.classStatistics.forEach(classStatistics => {
        console.log(classStatistics);
        this._classStatistics.push(classStatistics);
         //classStatistics.classAggregate.methodContexts.forEach(methodContext=> {
         // this._methods.errorFingerprint.push(methodContext);
        // })
      })
    });
  }
}
