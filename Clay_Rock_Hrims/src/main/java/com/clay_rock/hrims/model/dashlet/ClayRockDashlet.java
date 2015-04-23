package com.clay_rock.hrims.model.dashlet;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.clay_rock.hrims.model.footer.ClayRockFooter;
import com.clay_rock.hrims.model.header.ClayRockHeader;
import com.clay_rock.hrims.model.layout.ClayRockLayout;
import com.clay_rock.hrims.model.theme.ClayRockTheme;

@Entity
@Table(name = "clay_rock_dashlet", uniqueConstraints = { @UniqueConstraint(columnNames = { "dashlet_id" }) })
public class ClayRockDashlet  implements Serializable{

	private static final long serialVersionUID = 8797537301796693797L;

	@Id
	@Column(name = "dashlet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dashletId;

	@Column(name = "dashlet_name", nullable = false)
	private String dashletName;
	
	@Column(name = "dashlet_title", nullable = false)
	private String dashletTitle;
	
	@Column(name = "dashlet_title", nullable = false)
	private ClayRockHeader dashlet_header;
	
	@Column(name = "dashlet_title", nullable = false)
	private ClayRockFooter dashlet_footer;
	
	@Column(name = "dashlet_theme", nullable = false)
	private ClayRockTheme dashlet_theme;

	@Column(name = "dashlet_layout", nullable = false)
	private ClayRockLayout dashlet_layout;
	
	@Column(name = "theme_id", nullable = false)
	private Integer themeId;
	
	@Column(name = "dashlet_content", nullable = false)
	private String dashletContent;
	
	/**
	 * Used to display dashlet according to there weight maintin order for display
	 */
	@Column(name = "dashlet_display_weight", nullable = false)
	private Integer dashlet_display_weight;
	
	@Column(name = "active", nullable = true)
	private boolean active = false;

	public Integer getDashletId() {
		return dashletId;
	}

	public void setDashletId(Integer dashletId) {
		this.dashletId = dashletId;
	}

	public String getDashletName() {
		return dashletName;
	}

	public void setDashletName(String dashletName) {
		this.dashletName = dashletName;
	}

	public String getDashletTitle() {
		return dashletTitle;
	}

	public void setDashletTitle(String dashletTitle) {
		this.dashletTitle = dashletTitle;
	}

	public ClayRockHeader getDashlet_header() {
		return dashlet_header;
	}

	public void setDashlet_header(ClayRockHeader dashlet_header) {
		this.dashlet_header = dashlet_header;
	}

	public ClayRockFooter getDashlet_footer() {
		return dashlet_footer;
	}

	public void setDashlet_footer(ClayRockFooter dashlet_footer) {
		this.dashlet_footer = dashlet_footer;
	}

	public ClayRockTheme getDashlet_theme() {
		return dashlet_theme;
	}

	public void setDashlet_theme(ClayRockTheme dashlet_theme) {
		this.dashlet_theme = dashlet_theme;
	}

	public ClayRockLayout getDashlet_layout() {
		return dashlet_layout;
	}

	public void setDashlet_layout(ClayRockLayout dashlet_layout) {
		this.dashlet_layout = dashlet_layout;
	}

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getDashletContent() {
		return dashletContent;
	}

	public void setDashletContent(String dashletContent) {
		this.dashletContent = dashletContent;
	}

	public Integer getDashlet_display_weight() {
		return dashlet_display_weight;
	}

	public void setDashlet_display_weight(Integer dashlet_display_weight) {
		this.dashlet_display_weight = dashlet_display_weight;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
