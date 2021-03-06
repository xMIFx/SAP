/*eslint-disable strict*/
$ = jQuery = require("jquery");
import React from "react";
import Header from "./common/header";
export default class App extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return <div>
      <Header/>
      <div className="container-fluid">
        {this.props.children}
      </div>
    </div>;
  }
}