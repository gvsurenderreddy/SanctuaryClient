/**
 *
 * @author Thunder
 */
package sanctuary.client;

import com.m3m.gui.JXTrayIcon;
import com.m3m.utils.Configuration;
import com.m3m.utils.EmaLogger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ApplicationWindow extends javax.swing.JFrame {

    private ApplicationController controller;
    private Configuration conf;
    private EmaLogger eLogger;
    private JXTrayIcon trayIcon;
    private ImageIcon exitIcon, loginIcon, abortIcon, gototrayIcon, restoreIcon,
            updateIcon, websiteIcon, aboutIcon, statusIcon, loadIcon;
    private Image abortImage, loginImage;

    public ApplicationWindow(ApplicationController controller, Configuration conf, EmaLogger eLogger) {
        this.controller = controller;
        this.conf = conf;
        this.eLogger = eLogger;
        setLookAndFeel();
        initComponents();
        loadImages();
        setButtonsAccelerators();
        createTrayIcon();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ApplicationWindow.this.controller.exit();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTray = new javax.swing.JPopupMenu();
        connectionMenuT = new javax.swing.JMenu();
        loginMenuItemT = new javax.swing.JMenuItem();
        statusMenuItemT = new javax.swing.JMenuItem();
        netConfigMenuT = new javax.swing.JMenu();
        loadMenuItemT = new javax.swing.JMenuItem();
        updateMenuItemT = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        aboutMenuItemT = new javax.swing.JMenuItem();
        restoreMenuItemT = new javax.swing.JMenuItem();
        exitMenuItemT = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        loginBT = new javax.swing.JButton();
        abortBT = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        gototrayMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        netConfigMenu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        updateMenuItem = new javax.swing.JMenuItem();
        connectionMenu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        statusMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        websiteMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        connectionMenuT.setMnemonic('C');
        connectionMenuT.setText("Connection");

        loginMenuItemT.setMnemonic('n');
        loginMenuItemT.setText("Login");
        loginMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemTActionPerformed(evt);
            }
        });
        connectionMenuT.add(loginMenuItemT);

        statusMenuItemT.setMnemonic('s');
        statusMenuItemT.setText("Status");
        statusMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusMenuItemTActionPerformed(evt);
            }
        });
        connectionMenuT.add(statusMenuItemT);

        menuTray.add(connectionMenuT);

        netConfigMenuT.setMnemonic('N');
        netConfigMenuT.setText("Net-Config");

        loadMenuItemT.setText("Load...");
        netConfigMenuT.add(loadMenuItemT);

        updateMenuItemT.setMnemonic('u');
        updateMenuItemT.setText("Update");
        updateMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemTActionPerformed(evt);
            }
        });
        netConfigMenuT.add(updateMenuItemT);

        menuTray.add(netConfigMenuT);
        menuTray.add(jSeparator3);

        aboutMenuItemT.setMnemonic('t');
        aboutMenuItemT.setText("About");
        aboutMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemTActionPerformed(evt);
            }
        });
        menuTray.add(aboutMenuItemT);

        restoreMenuItemT.setMnemonic('r');
        restoreMenuItemT.setText("Restore");
        restoreMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreMenuItemTActionPerformed(evt);
            }
        });
        menuTray.add(restoreMenuItemT);

        exitMenuItemT.setMnemonic('x');
        exitMenuItemT.setText("Exit");
        exitMenuItemT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemTActionPerformed(evt);
            }
        });
        menuTray.add(exitMenuItemT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginBT.setText("Login");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });

        abortBT.setText("Abort");
        abortBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abortBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(abortBT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abortBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        statusPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusPanel.setPreferredSize(new java.awt.Dimension(352, 25));
        statusPanel.setLayout(new java.awt.CardLayout());

        statusLabel.setText("Click Login button to connted to Virtus VPN servers !");
        statusPanel.add(statusLabel, "card2");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        gototrayMenuItem.setMnemonic('T');
        gototrayMenuItem.setText("Goto Tray");
        gototrayMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gototrayMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(gototrayMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        netConfigMenu.setMnemonic('N');
        netConfigMenu.setText("Net-Config");

        loadMenuItem.setMnemonic('o');
        loadMenuItem.setText("Load...");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        netConfigMenu.add(loadMenuItem);

        updateMenuItem.setMnemonic('u');
        updateMenuItem.setText("Update...");
        updateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemActionPerformed(evt);
            }
        });
        netConfigMenu.add(updateMenuItem);

        menuBar.add(netConfigMenu);

        connectionMenu.setMnemonic('C');
        connectionMenu.setText("Connection");

        loginMenuItem.setMnemonic('l');
        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        connectionMenu.add(loginMenuItem);

        statusMenuItem.setMnemonic('s');
        statusMenuItem.setText("Status");
        statusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusMenuItemActionPerformed(evt);
            }
        });
        connectionMenu.add(statusMenuItem);

        menuBar.add(connectionMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        websiteMenuItem.setMnemonic('w');
        websiteMenuItem.setText("Visit Website");
        websiteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                websiteMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(websiteMenuItem);

        aboutMenuItem.setMnemonic('t');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        controller.exit();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void websiteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_websiteMenuItemActionPerformed
        controller.getConnectionManager().openWebsite();
    }//GEN-LAST:event_websiteMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        showAbout();
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed
        controller.login();
    }//GEN-LAST:event_loginBTActionPerformed

    private void updateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemActionPerformed
        controller.update();
    }//GEN-LAST:event_updateMenuItemActionPerformed

    private void statusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusMenuItemActionPerformed
        boolean connected = controller.getConnectionManager().isConnected();
        showConnectionStatus(connected);
    }//GEN-LAST:event_statusMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        controller.login();
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void gototrayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gototrayMenuItemActionPerformed
        controller.gototray();
    }//GEN-LAST:event_gototrayMenuItemActionPerformed

    private void exitMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemTActionPerformed
        controller.exit();
    }//GEN-LAST:event_exitMenuItemTActionPerformed

    private void restoreMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreMenuItemTActionPerformed
        controller.restore();
    }//GEN-LAST:event_restoreMenuItemTActionPerformed

    private void aboutMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemTActionPerformed
        showAbout();
    }//GEN-LAST:event_aboutMenuItemTActionPerformed

    private void updateMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemTActionPerformed
        controller.update();
    }//GEN-LAST:event_updateMenuItemTActionPerformed

    private void statusMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusMenuItemTActionPerformed
        controller.getConnectionManager().getStatus();
    }//GEN-LAST:event_statusMenuItemTActionPerformed

    private void loginMenuItemTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemTActionPerformed
        controller.login();
    }//GEN-LAST:event_loginMenuItemTActionPerformed

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        controller.loadNetConfigFile();
    }//GEN-LAST:event_loadMenuItemActionPerformed

    private void abortBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abortBTActionPerformed
        controller.abort();
    }//GEN-LAST:event_abortBTActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abortBT;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItemT;
    private javax.swing.JMenu connectionMenu;
    private javax.swing.JMenu connectionMenuT;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exitMenuItemT;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem gototrayMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem loadMenuItemT;
    private javax.swing.JButton loginBT;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuItem loginMenuItemT;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPopupMenu menuTray;
    private javax.swing.JMenu netConfigMenu;
    private javax.swing.JMenu netConfigMenuT;
    private javax.swing.JMenuItem restoreMenuItemT;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JMenuItem statusMenuItem;
    private javax.swing.JMenuItem statusMenuItemT;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JMenuItem updateMenuItem;
    private javax.swing.JMenuItem updateMenuItemT;
    private javax.swing.JMenuItem websiteMenuItem;
    // End of variables declaration//GEN-END:variables

    private void setLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (conf.get("LookAndFeelModel").equalsIgnoreCase(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            eLogger.log(ex);
        }
    }

    private void loadImages() {
        // Exit Buttons:
        exitIcon = getImageIcon("exit");
        exitMenuItem.setIcon(exitIcon);
        exitMenuItemT.setIcon(exitIcon);

        // Login, Abort Buttons:
        abortIcon = getImageIcon("abort");
        abortBT.setIcon(exitIcon);
        loginIcon = getImageIcon("login");
        loginBT.setIcon(loginIcon);

        loginMenuItem.setIcon(loginIcon);
        loginMenuItemT.setIcon(loginIcon);

        //  Button:
        loadIcon = getImageIcon("file");
        loadMenuItem.setIcon(loadIcon);
        loadMenuItemT.setIcon(loadIcon);

        // Gototray Button:
        gototrayIcon = getImageIcon("gototray");
        gototrayMenuItem.setIcon(gototrayIcon);

        // Restore Button:
        restoreIcon = getImageIcon("restore");
        restoreMenuItemT.setIcon(restoreIcon);

        // Update Buttons:
        updateIcon = getImageIcon("update");
        updateMenuItem.setIcon(updateIcon);
        updateMenuItemT.setIcon(updateIcon);

        // Websites Buttons:
        websiteIcon = getImageIcon("website");
        websiteMenuItem.setIcon(websiteIcon);

        // About Buttons:
        aboutIcon = getImageIcon("about");
        aboutMenuItem.setIcon(aboutIcon);
        aboutMenuItemT.setIcon(aboutIcon);

        // Status Buttons:
        statusIcon = getImageIcon("status");
        statusMenuItem.setIcon(statusIcon);
        statusMenuItemT.setIcon(statusIcon);

        // Images for Tray Icon:
        abortImage = getImage("abort");
        loginImage = getImage("login");
    }

    private void setButtonsAccelerators() {
        loadMenuItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        gototrayMenuItem.setAccelerator(KeyStroke.getKeyStroke("control G"));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke("alt F4"));
        loginMenuItem.setAccelerator(KeyStroke.getKeyStroke("control C"));

        updateMenuItem.setAccelerator(KeyStroke.getKeyStroke("control U"));
        statusMenuItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
    }

    private void createTrayIcon() {
        if (!SystemTray.isSupported()) {
            return;
        }

        trayIcon = new JXTrayIcon(abortImage, this);
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip(controller.getTrayIconMessage());
        trayIcon.setJPopupMenu(menuTray);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ApplicationWindow.this.getState() == Frame.NORMAL) {
                    ApplicationWindow.this.controller.gototray();
                } else {
                    ApplicationWindow.this.controller.restore();
                }
            }
        };

        trayIcon.addActionListener(listener);
        try {
            SystemTray.getSystemTray().add(trayIcon);
        } catch (AWTException ex) {
            Logger.getLogger(ApplicationWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void toggleGuiControls(boolean login) {
        String caption;
        Image img;
        ImageIcon icon;
        if (login) {
            caption = "Abort";
            img = loginImage;
            icon = abortIcon;
        } else {
            caption = "Login";
            img = abortImage;
            icon = loginIcon;
        }

        loginMenuItem.setText(caption);
        loginMenuItemT.setText(caption);

        loginBT.setIcon(icon);
        loginMenuItem.setIcon(icon);
        loginMenuItemT.setIcon(icon);

        if (trayIcon != null) {
            trayIcon.setImage(img);
            trayIcon.setToolTip(controller.getTrayIconMessage());
        }

        setEnabledForButtons(!login);
        statusLabel.setText(controller.getConnectionManager().getStatus());
        showConnectionStatus(login);
    }

    void showConnectionStatus(boolean connected) {
        if (connected) {
            JOptionPane.showMessageDialog(this, conf.get("TXT_Body_Login"), conf.get("TXT_Title_Login"), JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, conf.get("TXT_Body_Abort"), conf.get("TXT_Title_Abort"), JOptionPane.WARNING_MESSAGE);
        }
    }

    void showUpdateStarted() {
        JOptionPane.showMessageDialog(this, conf.get("TXT_Body_Update_P"), conf.get("TXT_Title_Update_P"), JOptionPane.INFORMATION_MESSAGE);
    }

    void showUpdateResult(boolean successfulUpdate) {
        String body, title;
        int messageType;
        if (successfulUpdate) {
            body = conf.get("TXT_Body_Update_S");
            title = conf.get("TXT_Title_Update_S");
            messageType = JOptionPane.INFORMATION_MESSAGE;
        } else {
            body = conf.get("TXT_Body_Update_F");
            title = conf.get("TXT_Title_Update_F");
            messageType = JOptionPane.WARNING_MESSAGE;
        }
        updateMenuItem.setEnabled(true);
        updateMenuItemT.setEnabled(true);
        JOptionPane.showMessageDialog(this, body, title, messageType);
    }

    private void showAbout() {
        String title = String.format("About: %s %s", conf.get("Project"), conf.get("Application"));

        String message = String.format("%s %s v%s\nDeveloped by: %s.\n%s.",
                conf.get("Project"), conf.get("Application"), conf.get("Version"),
                conf.get("Developer"), conf.get("Copyright"));

        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    void showNetConfigFileSetOptions() {
        String[] options = {"Load", "Update", "Cancel"};

        int selectedOption = JOptionPane.showOptionDialog(this,
                conf.get("TXT_Body_FIX"), conf.get("TXT_Title_FIX"),
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        if (selectedOption == JOptionPane.YES_OPTION) {
            controller.loadNetConfigFile();
        } else if (selectedOption == JOptionPane.NO_OPTION) {
            controller.update();
        }
    }

    File browseForNetConfig() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        chooser.setFileFilter(new FileNameExtensionFilter(conf.get("FileFilterDescription"), conf.get("FileFilterExtension")));
        chooser.setFileHidingEnabled(false);
        chooser.setApproveButtonText("Load");
        chooser.setApproveButtonToolTipText("Load Config File");
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }

    void showLoadNetConfigResult(boolean result) {
        if (result) {
            JOptionPane.showMessageDialog(this, conf.get("TXT_Body_Load_S"),
                    conf.get("TXT_Title_Load_S"), JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, conf.get("TXT_Body_Load_F"),
                    conf.get("TXT_Title_Load_F"), JOptionPane.WARNING_MESSAGE);
        }
    }

    public void setEnabledForButtons(boolean enabled) {
        loginBT.setEnabled(enabled);
        loginMenuItem.setEnabled(enabled);
        loginMenuItemT.setEnabled(enabled);
    }

    public void disableUpdateButtons() {
        updateMenuItem.setEnabled(false);
        updateMenuItemT.setEnabled(false);
    }

    private URL getImageFilename(String imageFilename) {
        String fileURL = conf.get("ImagesFolder") + imageFilename + conf.get("ImageExtension");
        return sanctuary.MainAdmin.class.getResource(fileURL);
    }

    private ImageIcon getImageIcon(String imageFilename) {
        URL url = getImageFilename(imageFilename);
        return new ImageIcon(url);
    }

    private Image getImage(String imageFilename) {
        return Toolkit.getDefaultToolkit().getImage(getImageFilename(imageFilename));
    }
}