package com.cj.Decorator;

public abstract class Decorator extends Component {
	
	protected Component component;

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		if (component != null) {
			component.operation();
		}
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

}
