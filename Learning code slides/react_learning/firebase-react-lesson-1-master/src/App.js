import React from 'react';

import FunctionalComponent from './components/FunctionalComponent';
import ClassComponent from './components/ClassComponent';
import StatefulComponent from './components/StatefulComponent';
import CounterComponent from './components/CounterComponent';
import SayHello from './components/SayHello';

const App = () => {
  const names = [
    'Amanda',
    'Stefano',
    'Duncan',
    'Alisha',
    'Everstina',
    'rachel'
  ];

  return (
    <div className="container">
      <div className="row">
        <FunctionalComponent />
        <ClassComponent />
        <StatefulComponent />
      </div>
      <CounterComponent />

      {/* Exercise */}
      <div className="row">
        {names.map(name => {  
        return <SayHello to={name} />
          // How can I say hello to people here? by returning the information in the array. 
        })}
      </div>
    </div>
  );
};
 
export default App;

