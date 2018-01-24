FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.78"
KBRANCH ?= "linux-4.9.y"
SRCREV ?= "79584a4221253611a4d033087f373b046350df9f"

require linux-stable.inc

COMPATIBLE_MACHINE = "(odroid-xu3|odroid-xu4|odroid-xu3-lite|odroid-xu4s)"
