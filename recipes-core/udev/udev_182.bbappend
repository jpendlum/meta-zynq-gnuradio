FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	         file://80-user_peripheral.rules \
           "

do_install_append() {
    install -m 0644 ${WORKDIR}/80-user_peripheral.rules ${D}${sysconfdir}/udev/rules.d/80-user_peripheral.rules
}